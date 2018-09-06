/**
 * @author lowstef
 * @create 2018/8/15
 * @since 1.0.0
 */
package practice;

public class Test3 {

    public static void main(String[] args) {

        stu stu = new stu();


    }


}

class person{


    public person(String name) {
    }

    public person() {

    }
}
class stu extends person{



    public stu(String name) {
        super(name);
    }


    public stu() {
        super();
    }
}