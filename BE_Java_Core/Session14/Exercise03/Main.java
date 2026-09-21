package vn.edu.rikkei.session14.ex03;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- THỬ NGHIỆM EXPORT REPORT VỚI FINALLY ---");
        System.out.println("Lần 1: Xuất báo cáo bình thường (shouldFail = false)");
        System.out.println("Lần 2: Xuất báo cáo gặp sự cố mạng (shouldFail = true)\n");

        ReportExporter exporter = new ReportExporter();

        System.out.println("+-------------------------------------------------+");
        System.out.println("|           NHẬT KÝ EXPORT BÁO CÁO KẾ TOÁN        |");
        System.out.println("+-------------------------------------------------+");
        System.out.printf("| %-47s |\n", "[Lần 1 - Thành công]");
        exporter.exportReport(false);

        System.out.println("|-------------------------------------------------|");
        System.out.printf("| %-47s |\n", "[Lần 2 - Gặp sự cố mạng]");
        exporter.exportReport(true);

        System.out.println("+-------------------------------------------------+");
    }
}
