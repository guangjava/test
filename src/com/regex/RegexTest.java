package com.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**测试正则表达式
 * @author guang
 *
 */
public class RegexTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>() ;
//		list.add("192.168.1.0");
//		list.add("1.1.1.1");
//		list.add("0.12.256.1,127.0.0.1");
//		list.add("192.168.1.0,0.12.256.1,127.0.0.1");
//
//		String regex = "((?:(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.){3}(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d))))";
//		Pattern p = Pattern.compile(regex);
//
//		for (String string : list) {
//			System.out.println(p.matcher(string).matches());
//		}
		testservice_ref_qname_pattern();
		
		System.out.println("********************");

	}

	private static void strMatch() {
		String phone = "13539770000";
		//检查phone是否是合格的手机号(标准:1开头，第二位为3,5,8，后9位为任意数字)
		System.out.println(phone + ":" + phone.matches("1[358][0-9]{9,9}")); //true    
		System.out.println(phone.matches("\\d+"));
		String email = "4153436546@qq.com@";
		System.out.println(email + ":" + email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}"));
		String str = "abcd12345efghijklmn";
		//检查str中间是否包含12345
		System.out.println(str + ":" + str.matches("\\w+12345\\w+")); //true
		System.out.println(str + ":" + str.matches("\\w+123456\\w+")); //false
	}
	
	/**用正则表达式获取指定字符串内容中的指定内容
	 * @param src 指定字符串
	 * @param regex
	 * @author zhouchenguang
	 * @date 2016年6月20日上午11:25:18
	 * @since 1.0.0
	 */
	public static void getStrings(String src,String regex){
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(src);
		ArrayList<String> strs = new ArrayList<String>();
		while (matcher.find()) {
			strs.add(matcher.group(1));            
		} 
		for (String s : strs){
			System.out.println(s);
		} 
	}
	
	public static void getStrings(String src,String regex,String regex2){
		Pattern pattern = Pattern.compile(regex);
		Pattern pattern2 = Pattern.compile(regex2);
		Matcher matcher = pattern.matcher(src);
		ArrayList<String> strs = new ArrayList<String>();
		while (matcher.find()) {
			strs.add(matcher.group(1));            
		} 
		for (String s : strs){
			Matcher matcher2 = pattern2.matcher(s);
			while (matcher2.find()) {
				System.out.println(matcher2.group(1));
			}
		} 
	}

	private static void strSplit() {
		String str = "asfasf.sdfsaf.sdfsdfas.asdfasfdasfd.wrqwrwqer.asfsafasf.safgfdgdsg";
		String[] strs = str.split("\\.");
		for (String s : strs){
			System.out.println(s);
		}        
	}

	private static void getStrings() {
		String str = "rrwerqq84461376qqasfdasdfrrwerqq84461377qqasfdasdaa654645aafrrwerqq84461378qqasfdaa654646aaasdfrrwerqq84461379qqasfdasdfrrwerqq84461376qqasfdasdf";
		Pattern p = Pattern.compile("qq(.*?)qq");
		Matcher m = p.matcher(str);
		ArrayList<String> strs = new ArrayList<String>();
		while (m.find()) {
			strs.add(m.group(1));            
		} 
		for (String s : strs){
			System.out.println(s);
		}        
	}

	private static void replace() {
		String str = "asfas5fsaf5s4fs6af.sdaf.asf.wqre.qwr.fdsf.asf.asf.asf";
		//将字符串中的.替换成_，因为.是特殊字符，所以要用\.表达，又因为\是特殊字符，所以要用\\.来表达.
		str = str.replaceAll("\\.", "_");
		System.out.println(str);        
	}
	
	/**删除html中的标签，保留正文
	 * @param src
	 * @param patterns
	 * @return
	 * @exception
	 * @author zhouchenguang
	 * @date 2016年11月18日下午2:55:01
	 * @since 1.0.0
	 */
	public static String removeHtmlMark(String source) {
		List<String> patternRemove = new ArrayList<>();
		//删除<a>和</a>
		patternRemove.add("<\\w*>");
		patternRemove.add("</\\w*>");
		for (String string : patternRemove) {
			source = source.replaceAll(string, "");
		}
		//删除空行
		source = source.replaceAll("[\r\n]+", "\r\n");
		//替换转义字符
		source = source.replaceAll("&lt;", "<");
		source = source.replaceAll("&gt;", ">");
		source = source.replaceAll("&amp;", "&");
		return source;
	}
	
	public static boolean testservice_ref_qname_pattern() {
		Pattern pattern = Pattern.compile("\\*|([\\i-[:]][\\c-[:]]*:)?[\\i-[:]][\\c-[:]]*\\*?");
		System.out.println("*"+pattern.matcher("*"));
		System.out.println("ns1：EchoService"+pattern.matcher("ns1：EchoService"));
		System.out.println("ns1：EchoService*"+pattern.matcher("ns1：EchoService*"));
		return true;
	}
}

