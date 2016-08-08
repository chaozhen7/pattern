<p>抽象工厂模式
<br>抽象工厂模式提供一个抽象工厂类，其它工厂类实现该类，产生一些列的产品，即一个工厂可以产生一个产品族的产品，但是不符合开闭原则，需要添加新产品时，所有的类都要修改，添加一个新产品族时方便，封闭倾斜。
<p>抽象工厂模式总结
<p>主要优点 
<br>抽象工厂模式的主要优点如下:
<br>(1) 抽象工厂模式隔离了具体类的生成,使得客户并不需要知道什么被创建。由于这种隔离, 更换一个具体工厂就变得相对容易,所有的具体工厂都实现了抽象工厂中定义的那些公共接 口,因此只需改变具体工厂的实例,就可以在某种程度上改变整个软件系统的行为。
<p>主要缺点
<br>
在以下情况下可以考虑使用抽象工厂模式:
<br>(1) 一个系统不应当依赖于产品类实例如何被创建、组合和表达的细节,这对于所有类型的工 厂模式都是很重要的,用户无须关心对象的创建过程,将对象的创建和使用解耦。