# 自定义标签
## 实现步骤
1. 创建一个自定义标签类

2. 自定义实现标签解析器，可以继承AbstractSingleBeanDefinitionParser，重写getBeanClass()和doParse()。 

    getBeanClass()返回beaDefinition对应的类的class对象，即第一步创建的自定义标签类。

    doParse()实现具体的标签解析逻辑
   
3. 自定义实现标签处理器，继承NamespaceHandlerSupport，重写init()。
   
    在init()中调用registerBeanDefinitionParser()注册标签解析器，即第二步创建的自定义标签解析器

4. 在META-INF目录下，创建spring.handlers、spring.schemas、自定义xsd约束 三个文件
   
    spring.handlers文件中指定自定义标签指向的处理器
    
    spring.schemas文件中指定自定义标签的xsd约束

    自定义xsd约束文件规定了自定义标签的约束