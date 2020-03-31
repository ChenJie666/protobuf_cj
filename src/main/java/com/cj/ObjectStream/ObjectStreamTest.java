package com.cj.ObjectStream;

import com.cj.ObjectStream.entity.Student;

import java.io.*;
import java.util.Arrays;

public class ObjectStreamTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student stu = new Student(1,"cj","xxx.com");
        //序列化
        byte[] bytes = serialize(stu);
        //
        System.out.println(Arrays.toString(bytes));
        //反序列化
        Student student = deSerialize(bytes);
        System.out.println(student);
    }
    //序列化
    public static byte[] serialize(Student student) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(student);
        byte[] bytes = bos.toByteArray();   //转成字节数组
        return bytes;
    }
    //反序列化
    public static Student deSerialize(byte[] bytes) throws IOException, ClassNotFoundException {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Student student = (Student) ois.readObject();
        return student;
    }
}
