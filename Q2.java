public class Q2 {
    public static void main(String[] args) {
//إنشاء صفين فارغين باسم queue و q، كل منهما قادر على تخزين 10 عناصر
        ArrauQueue<Integer>queue=new ArrauQueue<>(10);
        ArrauQueue<Integer>q=new ArrauQueue<>(10);
//الاضافه
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.print("list1: ");
        queue.print(queue);//طباعه الكيو
        //استدعاء دالة clone  لإنشاء نسخة مستقلة من الصف queue وتخزينها في الصف q.
        q= q.clone(queue);
        System.out.print("\nlist2: ");
        // عرض العناصر الموجودة في الصف q بعد النسخ تكون مطابقةqueue.
        q.print(q);
        System.out.print("\nlist1: ");
        queue.print(queue);
    }
}