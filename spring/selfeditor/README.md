# 自定义属性编辑器
## 实现步骤
1. 创建目标实体类

2. 自定义实现属性编辑器，继承PropertyEditorSupport，重写setAsText()，在此方法最后调用PropertyEditorSupport#setValue()。

3. 自定义实现属性编辑注册器，实现PropertyEditorRegistrar接口，实现registerCustomEditors()，
   在此方法中调用PropertyEditorRegistry#registerCustomEditor()注册属性编辑器，即第二步创建的自定义属性编辑器。

4. 将自定义的属性编辑器注入CustomEditorConfigurer配置类中，这里有两种实现方式：
   > 1. 将自定义的属性编辑器注册到自定义的属性编辑器注册器中，然后将自定义的属性编辑注册器注入到CustomEditorConfigurer#propertyEditorRegistrars属性
   > 2. 将自定义的属性编辑器直接注入到CustomEditorConfigurer#customEditors属性