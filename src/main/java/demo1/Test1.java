/**
 * @author lowstef
 * @create 2018/8/18
 * @since 1.0.0
 */
package demo1;

public class Test1 {

    public static void main(String[] args) {

        Class<String> stringClass = String.class;
        Class<Person> personClass = Person.class;
        Class<?> person = null;
        try {
            person = Class.forName("demo1.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Class<? extends String> aClass = "hello".getClass();
        Person person1 = new Person("刘德华",55);


        System.out.println(person1.getClass());


    }

}
