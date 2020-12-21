package exception_debug.bai_tap;

public class IllegalTriangleException extends Exception {
    IllegalTriangleException(){
        super("Đây không phải là tam giác");
    }
    IllegalTriangleException(String msg){
        super(msg);
    }
}
