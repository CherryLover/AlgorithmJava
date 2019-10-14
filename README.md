# AlgorithmJava

这个代码仓库仅用于本人学习算法知识所用。更新顺序与《小灰的算法之旅》相同。

## 数组

### 插入

数组的插入分为：

- 头部插入

  顾名思义，也就是在数组的最前面插入数据，每次插入的位置都是数组下标为 0 的位置；

- 中间插入

  中间插入，就是在数组中任意一个下标进行插入，插入时，待插入位置及其右边(后面)的数据依次向右移动一位，为新数据的插入提供位置；

- 尾部插入

  尾部插入就是每次插入均位于数组的最后位置；

但无论通过什么形式的插入，都需要在数组插入数据时，对数组长度进行判断，判断其是否需要扩容，如需要扩容则创建一个长度为原数组长度 n 倍的数组，并将其复制，最后再把新数组赋值给旧数组即可。

#### 时间复杂度

数组插入的时间复杂度可分为扩容及实际插入两个部分，扩容的复杂度为 n，实际插入的复杂度为 n，综合起来，为 2n，去除最高项系数，则数组插入的时间复杂度为 n。

### 删除

删除元素与插入正好相反，将待删除元素右侧(后面)的数据依次向左(前)移动一位即可。

### 小结

数组有非常高效的随机访问能力，只要给出下标，就可以用常量时间找到对于的元素「时间复杂度为 1」。但是在插入及删除元素方面就显得不那么便捷，由于数组元素紧密的存储在内存中，所以插入、删除元素都会导致大量元素被迫移动，影响效率。

## 链表

链表分为：

- 单向链表
- 双向链表

### 插入

- 头部插入

  头部插入在 size 为 0 时进行，插入的节点既是 head 同时也是 last；

- 中部插入

  中部插入时，需要将下一节点设置为当前的 next，并把前一个节点的 next 设为当前节点；

- 尾部插入

  尾部插入时，下标为 size - 1，插入后需要设置前一节点的 next 为当前节点，且当前节点为 last；

### 删除

与插入正好相反，在删除操作时，将其 next 关系解除即可。Java 这类高级语言具有自动垃圾回收机制。

### 时间复杂度

在不考虑遍历元素的情况下，链表的插入及删除的时间复杂度均为 1。

### 小结

由于链表在存储过程中使用随机存储的方式进行存储，所以，在插入时，不需要考虑链表的扩容行为，因为每一节点已经包含了下一节点。同样的，依赖于随机存储的特性，在删除节点时，不需要像数组对剩余数据的搬运，仅需要处理当前节点 next 节点即可。

## 栈

### 栈

先入后出(FIFO)

#### 基本操作：

- 入栈
- 出栈

#### 时间复杂度

入栈、出栈均为 1。