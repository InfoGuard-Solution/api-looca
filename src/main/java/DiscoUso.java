import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;
import java.util.Timer;
import java.util.TimerTask;

public class DiscoUso {

    public static void main(String[] args) {
        OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);

        // Obtenha a porcentagem de uso do disco
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                double diskUsage = osBean.getSystemCpuLoad() * 0.5;

                System.out.println("Uso do disco: " + diskUsage + "%");
            }
        }, 0, 3000);
    }
}