创建一个类Point
有成员变量x, y，它们都是int类型。
有四个成员方法setX(int)、setY(int)、getPoint()和movePoint(int,int)。
setX(int)和setY(int)方法是设置成员变量x和y的值；
getPoint()方法则获得由x, y构成的坐标点；
movePoint(int,int)带两个int参数，用来修改x，y构成的坐标点。

Point类有一个构造方法，不带参数，为x, y设置原点值。
另一个类为TestPoint，有一个main()方法，用来对Point类的实例进行测试。要求为其实例设置(0,0)坐标点，再移动到(10, 20)坐标点上，并输出实例调用相应的方法的结果