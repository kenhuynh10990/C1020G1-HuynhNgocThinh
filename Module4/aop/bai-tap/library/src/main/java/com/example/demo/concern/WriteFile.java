package com.example.demo.concern;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@Aspect
public class WriteFile {
    public static String bookName;

    @AfterReturning(pointcut = "execution(public * com.example.demo.controller.BookController.save(*))")
    public void afterCreateBook() throws IOException {
        System.out.println("c");
        FileWriter fileWriter = new FileWriter("D:\\C1020G1_Huynh_Ngoc_Thinh\\Module4\\aop\\bai-tap\\library\\src\\main\\resources\\static\\history.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(bookName + "đã được thêm vào");
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    @AfterReturning(pointcut = "execution(public * com.example.demo.controller.RenterController.rented(*))")
    public void afterRent() throws IOException {
        System.out.println("v");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\C1020G1_Huynh_Ngoc_Thinh\\Module4\\aop\\bai-tap\\library\\src\\main\\resources\\static\\history.txt"));
        bufferedWriter.write("Sách" + bookName + " đã được mượn");
        bufferedWriter.close();
    }

    @AfterReturning(pointcut = "execution(public * com.example.demo.controller.RenterController.refund(*))")
    public void afterRefund() throws IOException {
        System.out.println("a");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\C1020G1_Huynh_Ngoc_Thinh\\Module4\\aop\\bai-tap\\library\\src\\main\\resources\\static\\history.txt"));
        bufferedWriter.write("Sách " + bookName + " đã được trả");
        bufferedWriter.close();
    }

}
