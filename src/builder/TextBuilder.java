package builder;

public class TextBuilder extends Builder {

    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("==========================\n");
        buffer.append("[" + title + "]");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append('ㅁ' + str + "\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append(" ㅇ" + items[i] + "\n");
            buffer.append("\n");
        }
    }

    @Override
    public void close() {
        buffer.append("==========================");
    }

    public String getResult(){
        return buffer.toString();
    }
}
