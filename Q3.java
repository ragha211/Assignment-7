public class Q3 {
    public static void main(String[] args) {
        //يتم إنشاء قائمتين مرتبطتين فارغتين باسم L و M
        sLinkedQueue<Integer>L=new sLinkedQueue<>();
        sLinkedQueue<Integer>M=new sLinkedQueue<>();
        L.enqueue(10);
        L.enqueue(20);
        L.enqueue(30);
        M.enqueue(40);
        M.enqueue(50);
        M.enqueue(60);
        //  دمج قائمتي L و M في قائمة واحدة جديدة تُخزن في L
        L=L.append(L,M);
        L.print();
    }
}