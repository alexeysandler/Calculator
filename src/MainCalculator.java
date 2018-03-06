import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MainCalculator {
    public static void main(String[] args) {
        int a = 6;
        int b = 2;

        SumClass sumClass = new SumClass();
        System.out.println("sum = " +sumClass.sum(a,b));
        System.out.println("sub = "+new Class_sub().sub(a,b));
        System.out.println("mul = "+ new Class_Mul().mul(a,b));
        System.out.println("div = "+ new Class_Div().div(a,b));
        System.out.println("sum = " +sumClass.sum(a,b)+" "+ "mul = "+ new Class_Mul().mul(a,b));

    }
}
