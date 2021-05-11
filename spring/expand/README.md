# 扩展spring 4591
## 自定义容器
创建一个自定义容器类，继承ClassPathXmlApplicationContext类

可扩展内容：
1. 重写initPropertySources()，可在该方法中获取到Environment，进行一些操作

2. 重写customizeBeanFactory()，可在该方法中设置allowBeanDefinitionOverriding和allowCircularReferences属性

3. 重写postProcessBeanFactory()，可在该方法中调用AbstractApplicationContext#addBeanFactoryPostProcessor()添加自定义BeanFactoryPostProcessor
