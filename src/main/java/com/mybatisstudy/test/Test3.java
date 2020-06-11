package com.mybatisstudy.test;

import com.mybatisstudy.entity.Student;
import com.mybatisstudy.repository.ClassesRepository;
import com.mybatisstudy.repository.CustomerRepository;
import com.mybatisstudy.repository.GoodsRepository;
import com.mybatisstudy.repository.StudentRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Test3 {
    public static void main(String[] args) {
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        StudentRepository studentRepository = sqlSession.getMapper(StudentRepository.class);
//        System.out.println(studentRepository.findById(1L));
//        ClassesRepository classesRepository = sqlSession.getMapper(ClassesRepository.class);
//        System.out.println(classesRepository.findById(2L));
//        CustomerRepository customerRepository = sqlSession.getMapper(CustomerRepository.class);
//        System.out.println(customerRepository.findById(1L));
//        GoodsRepository goodsRepository = sqlSession.getMapper(GoodsRepository.class);
//        System.out.println(goodsRepository.findById(1L));

        StudentRepository studentRepository = sqlSession.getMapper(StudentRepository.class);
        Student student = studentRepository.findByIdLazy(1L);

        System.out.println(student.getName());
//        ClassesRepository classesRepository = sqlSession.getMapper(ClassesRepository.class);
//        System.out.println(classesRepository.findById(student.getClasses().getId()));
        sqlSession.close();

    }
}
