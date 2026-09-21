package vn.edu.rikkei.session14.ex03;

public class ServerResource {
    public void open() {
        System.out.printf("| %-47s |\n", "-> [ServerResource] Đang mở kết nối máy chủ...");
    }

    public void writeData(boolean triggerError) {
        if (triggerError) {
            throw new RuntimeException("Mất kết nối mạng ngẫu nhiên!");
        }
        System.out.printf("| %-47s |\n", "-> [ServerResource] Ghi dữ liệu báo cáo thành công.");
    }
    public void close() {
        System.out.printf("| %-47s |\n", "-> [ServerResource] ĐÃ ĐÓNG KẾT NỐI AN TOÀN (Finally)");
    }
}
