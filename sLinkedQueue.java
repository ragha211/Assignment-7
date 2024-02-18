//توفير وظائف إضافة وإزالة وطباعة عناصر الصف
public class sLinkedQueue <E> implements interfaceQueue<E> {
    singleLinkedList<E> list = new singleLinkedList<>();//لتمثيل عناصر الصف

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E first() {

        return list.first();  //طابور عادي

    }

    @Override
    public void enqueue(E e) {

        list.addLast(e);//طابور عادي
    }

    @Override
    public E dequeue() {

        return list.removeFirst(); //طابور عادي
    }

    public void rotate() {//نقل العنصر الأول في الصف إلى نهايته.
        enqueue(dequeue());
    }

    public sLinkedQueue<E> append(sLinkedQueue<E> L, sLinkedQueue<E> M) {
// يقوم بدمج صفين مرتبطين أحادي الاتجاه في صف واحد
        L.list.size += M.list.size;
        L.list.tail.next = M.list.head;
        L.list.tail = M.list.tail;

        return L;
    }

    public void print() {
        singleLinkedList.Node<E> i = list.head;
        while (i != null) {
            System.out.println(i.getElement());
            i = i.next;
        }
    }
}