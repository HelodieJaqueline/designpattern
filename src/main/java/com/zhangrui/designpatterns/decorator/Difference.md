#### 装饰者模式和适配器模式的根本区别
装饰器与适配器都有一个别名叫做 包装模式(Wrapper)，它们看似都是起到包装一个类或对象的作用，但是使用它们的目的很不一一样。适配器模式的意义是要将一个接口转变成另一个接口，它的目的是通过改变接口来达到重复使用的目的。 
而装饰器模式不是要改变被装饰对象的接口，而是恰恰要保持原有的接口，但是增强原有对象的功能，或者改变原有对象的处理方式而提升性能。所以这两个模式设计的目的是不同的。
