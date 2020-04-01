package com.cj.protobuf;

import com.cj.protobuf.entity.Student;
import com.google.protobuf.InvalidProtocolBufferException;

import java.util.Arrays;

public class protobuf_test {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        byte[] bytes = serialize();
        System.out.println(Arrays.toString(bytes));
        deSerialize(bytes);
    }

    public static byte[] serialize() {
        //构造一个Student对象
        Student.StudentBuf.Builder builder = Student.StudentBuf.newBuilder();
        builder.setId(1).setName("cj").setEmail("xxxx.com").setSex(Student.StudentBuf.Sex.MAN)
                .addPhone(Student.StudentBuf.PhoneNumber.newBuilder().setNumber("188xxxxx").setPhoneType(Student.StudentBuf.PhoneType.MOBILE));
        Student.StudentBuf student = builder.build();
        byte[] bytes = student.toByteArray();
        return bytes;
    }

    public static Student.StudentBuf deSerialize(byte[] bytes) throws InvalidProtocolBufferException {
        Student.StudentBuf studentBuf = Student.StudentBuf.parseFrom(bytes);
        return studentBuf;
    }

}
