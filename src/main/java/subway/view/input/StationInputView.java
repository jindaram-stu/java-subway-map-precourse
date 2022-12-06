package subway.view.input;

public class StationInputView implements InputView {

    private static final String INPUT_STATION_NAME = "## 등록할 역 이름을 입력하세요.";

    private static final String INPUT_DELETE_STATION_NAME = "## 삭제할 역 이름을 입력하세요.";

    public String readStationName() {
        System.out.println(INPUT_STATION_NAME);
        return scanner.nextLine();
    }

    public String readDeleteStationName() {
        System.out.println(INPUT_DELETE_STATION_NAME);
        return scanner.nextLine();
    }
}
