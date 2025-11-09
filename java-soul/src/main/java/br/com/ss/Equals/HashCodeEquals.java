package br.com.ss;

import java.util.HashSet;
import java.util.Set;

/*
He then said,

“Suppose you put a custom object inside a HashSet. How does Java know if two objects are equal?”

I said, “Using equals().”

He said, “Only partially. What about hashCode()?”

Then he explained: if two objects have the same logical value but different hash codes, the HashSet will treat them as different objects.

 */

public class HashCodeEquals {

    static void main() {
        Person p1 = new Person("John");
        Person p2 = new Person("John");

        Set<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        System.out.println(set.size());
    }

}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
    public boolean equals(Object o) {
        return ((Person)o).name.equals(this.name);
    }
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(name);
//    }
}