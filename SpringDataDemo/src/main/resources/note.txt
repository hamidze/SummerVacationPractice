Repository类的定义：
public interface Repository<T, ID extends Serializable> {

}

1）Repository是一个空接口，标记接口
没有包含方法声明的接口

2）如果我们定义的接口EmployeeRepository extends Repository

如果我们自己的接口没有extends Repository，运行时会报错：
org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.imooc.repository.EmployeeRepository' available

3) 添加注解能到达到不用extends Repository的功能
@RepositoryDefinition(domainClass = Employee.class, idClass = Integer.class)



insert into employee (name, age) values ("test1",20);
insert into employee (name, age) values ("test2",21);
insert into employee (name, age) values ("test3",22);
insert into employee (name, age) values ("test4",20);
insert into employee (name, age) values ("test5",21);
insert into employee (name, age) values ("test6",22);
insert into employee (name, age) values ("test16",22);

//"test",22
id:2 , name:test1 ,age:20
id:3 , name:test2 ,age:21
id:5 , name:test4 ,age:20
id:6 , name:test5 ,age:21

对于按照方法命名规则来使用的话，有弊端：
1）方法名会比较长： 约定大于配置
2）对于一些复杂的查询，是很难实现


@Query


事务在Spring data中的使用：
1）事务一般是在Service层
2）@Query、 @Modifying、@Transactional的综合使用





