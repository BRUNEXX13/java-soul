package br.com.ss.garbage;

/*
Heap
Área de memória compartilhada onde os objetos Java residem.
Gerenciada pelo Garbage Collector (GC): aloca objetos e recupera os inalcancáveis.
Pode ser grande e de longa duração; é dividida logicamente para fins de GC.

Stack (pilha)
Memória por thread para frames de método, primitivos locais e referências a objetos (não os objetos em si).
Estrutura LIFO: frames são empilhados na entrada de método e desempilhados no retorno.
Vida curta e determinística; o GC não percorre a pilha em si para coletar objetos (apenas as referências nos frames servem como raízes).

Geração jovem (eden + survivor)
Subparte do heap para objetos recém-criados.
Coletas frequentes e rápidas chamadas minor GC coletam essa região.
A maioria dos objetos de curta duração morre aqui; sobreviventes são copiados entre as survivor spaces e, após sobreviverem a certo número de coletas, são promovidos para a geração antiga.

Geração antiga (tenured)
Contém objetos que sobreviveram várias coletas da geração jovem (objetos de vida mais longa).
Coletada com menos frequência por major/full GC; essas coletas são mais caras porque escaneiam mais memória e referências.
Pode sofrer fragmentação; alguns coletores compactam essa região para reduzir a fragmentação.

Como pausas do GC funcionam
Muitos algoritmos de GC usam pausas stop-the-world (STW) onde as threads da aplicação são suspensas enquanto o GC executa fases (marcação, varredura, cópia, compactação).
Minor GC geralmente causa pausas curtas porque só varre a geração jovem. Major/full GC costuma causar pausas mais longas por processar a geração antiga.

Coletores modernos (G1, ZGC, Shenandoah) visam reduzir a duração das pausas usando fases concorrentes e processamento por regiões; eles trocam complexidade (e às vezes throughput) por menores pausas.
Gatilhos para pausas incluem falha de alocação, falha de promoção, chamadas explícitas a System.gc() ou heurísticas internas quando limites são alcançados.
Resumo rápido: pilha = frames por thread e referências; heap = onde os objetos vivem e são coletados; jovem = objetos de curta duração, coletas rápidas e frequentes;
antiga = objetos de longa duração, coletas menos frequentes e mais pesadas; pausas vêm de fases STW, salvo em coletores concorrentes/low-pause.
 */
public class GarbageCollector {
}
