/*
    给你一个字符串 s，由若干单词组成，
    单词前后用一些空格字符隔开。
    返回字符串中最后一个单词的长度。
    单词是指仅由字母组成、不包含任何空格字符的最大子字符串
 */
public class stringTest17 {
    public static void main(String[] args) {
        String str = "Hello World";
        int length = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i)==' '){
                break;
            }else {
                length++;
            }
        }
        System.out.println(length);
    }
}
