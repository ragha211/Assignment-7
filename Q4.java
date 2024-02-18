//يحاكي لعبة جوزيفوس الشهيرة حيث مجموعة من الأشخاص يقفون في دائرة،
// ويتم إقصاء شخص واحد في كل جولة بناءً على رقم محدد مسبقًا، والهدف هو معرفة الناجي الأخير.
public class Q4 {
    public static void main(String[] args) {
        int position = 2;//يحددالرقم الذي يمثل عدد الأشخاص الذين يتم تخطيهم قبل إقصاء شخص في كل جولة
        int count =4;//يحدد المتغير  عدد الأشخاص في اللعبة

        printJosephusPositions(count, position);//لتحديد الناجي بناءً على القيم المحددة.
    }
    public static void printJosephusPositions(int count, int position) {
        //تنشئ صفًا دائريًا من فئة LinkedQueue وتضيف إليه أرقام الأشخاص
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        for (int i = 0; i < count; i++) {//لتخطي الأشخاص المطلوبين
            queue.enqueue(i);
        }
        while(!queue.isEmpty()) {
            for (int i = 1; i <= position; i++) {
                int eliminatedPosition = queue.dequeue();//تزيل أول شخص من الصف وتخزنه في متغير
                if (i == position) {//إذا كانت هذه هي المرة الأخيرة للتخطي تطبع رقم الناجي وتخرج من الحلقة

                    System.out.println(eliminatedPosition + " ");
                    break;
                }
  //يكون الناجي الأخير هو المتبقي في الصف ولا تتم طباعته لأنه الفرع break
                queue.enqueue(eliminatedPosition);
            }}}}