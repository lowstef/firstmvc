/**
 * @author lowstef
 * @create 2018/8/22
 * @since 1.0.0
 */
package demo1;




public class Test6 {
    public static void main(String[] args) throws CloneNotSupportedException {

        Person person = new Person("张三",25);
        Person clone = (Person) person.clone();
        boolean equals = person.getName().equals(clone.getName());
        System.out.println(equals);


    }
}
