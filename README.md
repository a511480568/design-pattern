# Coding Interviews
<p>
  <a href="https://github.com/doocs/coding-interview/stargazers"><img src="https://img.shields.io/github/stars/doocs/coding-interview.svg" alt="stars"></a>
  <a href="https://github.com/doocs/coding-interview/network/members"><img src="https://img.shields.io/github/forks/doocs/coding-interview.svg" alt="forks"></a>
  <a href="http://makeapullrequest.com"><img src="https://img.shields.io/badge/PRs-Welcome-brightgreen.svg" alt="PRs Welcome"></a>
</p>

# 设计原则

## 开闭原则

对扩展开放，对修改关闭

提高软件的可用性和可维护性

## 依赖倒置原则

高层模块不应该依赖低层模块，两者都应该依赖其抽象

针对接口编程，不应该依赖实现编程

## 里氏替换原则

所有引用基类的地方都必须能透明的使用其子类对象

代码共享，提高代码的可用性

提高代码的可扩展性

提高产品或者项目的开放性

## 单一职责原则

不要存在多于一个导致类变更的原因

降低类的复杂度、提高类的可读性

降低变更引起的风险、提高系统的可维护性

## 接口隔离原则

客户端不应该依赖其他不需要的接口，类之间的依赖关系应该建立在最小的接口上

接口尽量要小，不要出现臃肿的接口

接口要高内聚

只提供需要访问的方法

## 迪米特法则（最少知道原则）--低耦合

一个对象应该对其他对象有最少的了解

一个类只和朋友交流，不和陌生类交流，方法尽量不引入类中不存在的对象

## 23种设计模式分类：

### 创建型模式：

单例模式、工厂方法模式、抽象工厂模式、建造者模式、原型模式

### 结构型模式：

适配器模式、装饰者模式、代理模式、门面模式、桥梁模式、组合模式、享元模式

### 行为模式：

策略模式、模板方法模式、观察者模式、迭代器模式、责任链模式、命令模式、备忘录模式、状态模式、访问者模式、中介者模式、解释器模式

### 扩展模式：

规则模式、对象池模式、雇工模式、黑板模式、空对象模式