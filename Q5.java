import java.util.Scanner;
//هذا الكود يحاكي خوارزمية Round Robin في جدولة العمليات لتحديد زمن انتظار
// ومجموع زمن خدمة لكل عملية وإيجاد المتوسطين لهما.
public class Q5 {
    public static void main(String args[]) {
        int n,x,q_t,count=0,temp,sq=0,b_t[],w_t[],ta_t[],rem_bt[];
        float aw_t=0,ata_t=0;
        b_t = new int[10];
        w_t = new int[10];
        ta_t = new int[10];
        rem_bt = new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.print("Number of processes(maximum 10) = ");//عدد العمليات
        n = sc.nextInt();
        System.out.print("Enter process burst time\n");//زمن خدمة لكل عملية
        for (x=0; x<n; x++) {
            System.out.print("P"+x+" = ");
            b_t[x] = sc.nextInt();
            rem_bt[x] = b_t[x];
        }
        System.out.print("Enter the quantum time: ");//قيمة زمن الكم
        q_t = sc.nextInt();
        while(true) {//تدور داخل حلقة while حتى تنتهي جميع العمليات
            for (x=0,count=0; x<n; x++) {//تدور داخل حلقة for لتفحص كل عملية:
                temp = q_t;
                if(rem_bt[x] == 0) {//إذا انتهى زمن خدمة العملية تنتقل إلى العملية التالية
                    count++;
                    continue;
                }
                if(rem_bt[x]>q_t)//إذا كان زمن العملية أكبر من زمن الكم، يتم خصم زمن الكم من المتبقي ويستمر العمل
                    rem_bt[x]= rem_bt[x] - q_t;
                else if(rem_bt[x]>=0) {//إذا كان زمن العملية أقل من أو يساوي زمن الكم، يتم اعتبار العملية منتهية
                    temp = rem_bt[x];
                    rem_bt[x] = 0;
                }
                sq = sq + temp;
                ta_t[x] = sq;
            }
            if(n == count)
                break;
        }
        System.out.print("*********************************************************************************");
        System.out.print("\nProcess\t  Burst Time\t  Turnaround Time\t  Waiting Time\n");
        System.out.print("*********************************************************************************");
        for(x=0; x<n; x++) {
            w_t[x]=ta_t[x]-b_t[x];//تحسب زمن انتظار لكل عملية  بفرق مجموع زمن خدمتها عن زمن خدمتها الأساسي.
            aw_t=aw_t+w_t[x];
            ata_t=ata_t+ta_t[x];
            System.out.print("\n "+(x+1)+"\t\t\t "+b_t[x]+"\t\t\t\t "+ta_t[x]+"\t\t\t\t\t "+w_t[x]+"\n");
        }
        aw_t=aw_t/n;//تحسب متوسط زمن انتظار ومجموع زمن خدمة وتطبعهما.
        ata_t=ata_t/n;
        System.out.println("\nThe Average waiting Time = "+aw_t+"\n");
        System.out.println("The Average turnaround time = "+ata_t);
    }
}
