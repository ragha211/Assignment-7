public class Q1 {
    public static void main(String[] args) {
        ArrauQueue<Integer> queue = new ArrauQueue<>(6);// إنشاء صف فارغ باسم queue يمكنه تخزين 6 عناصر
        System.out.println(queue.isEmpty());//يتم التأكد من أن الصف فارغ وطباعته.
        System.out.println(queue.size());//يتم طباعة حجمه الحالي (صفر).
        //ويتم الاضافه
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println(queue.size());//طباعه الحجم
        queue.rotate(queue);//rotate قد تغير ترتيب العناصر
        System.out.println(queue.isEmpty());// أن الصف ليس فارغًا وطباعته
        System.out.println(queue.size());//طباعه الحجم
        queue.print(queue);
    }
}
