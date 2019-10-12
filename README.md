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