import entity.CospaDTO;
import function.Controller;
import function.Display;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();
        Display display = new Display();
        ArrayList<CospaDTO> list = new ArrayList<>();
        for(; ; ) {
            display.listDisplay(list);
            System.out.println("入力：1 編集：2 削除：３");
            switch (scanner.nextLine()) {
                case "1": controller.listInput(scanner, list); break;
                case "2": controller.listEdit(scanner, list); break;
                default:continue;
            }

        }

    }
}
