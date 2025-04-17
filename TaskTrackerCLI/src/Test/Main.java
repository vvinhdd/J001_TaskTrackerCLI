package Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        StringBuilder jsonBuilder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader("data.json"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                jsonBuilder.append(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        String json = jsonBuilder.toString();
        
        System.out.println("Step 1: " + json); //Test

        // Bỏ dấu [ ] đầu cuối
        json = json.substring(1, json.length() - 1).trim();
        
        List<String> blocks = extractJsonBlocks(json);

        for (String block : blocks) {
            System.out.println("Step 2: " + block);
        }
        
        
//        Pattern pattern = Pattern.compile("\\{([^\\}]*)\\}");
//        Matcher matcher = pattern.matcher(json);
//        
//        ArrayList<String> step2 = new ArrayList<>();
//        // Lặp qua các kết quả và in ra
//        while (matcher.find()) {
//            //System.out.println("Step 2:" + matcher.group(1));  // group(1) là phần nội dung giữa { và }
//            step2.add(matcher.group(1));
//            
//        }
//        for (String s: step2) {
//        	System.out.println("Step 2: " + s);
//        }
        
        
        
//        //String regex = "(?<!\"[^\"]*),(?![^\"]*\")";
//        String regex = ",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)";
//        String[] parts = step2.get(1).split(regex);
//        for (String part : parts) {
//            System.out.println("Step 3:" + part);
//        }
        
//        System.out.println("Step 2: " + json); //Test
//        
//        // Tách từng object JSON (giả sử không có object lồng object)
//        String[] taskJsons = json.split("}");
//        
//        for (String task : taskJsons) {
//        	System.out.println("Step 3: " + task); //Test
//        	task = task.replace("{", "");
//        }
        
        
//
//        List<Task> tasks = new ArrayList<>();
//
//        for (String taskJson : taskJsons) {
//            // Làm sạch nếu cần
//            taskJson = taskJson.trim();
//            if (!taskJson.startsWith("{")) taskJson = "{" + taskJson;
//            if (!taskJson.endsWith("}")) taskJson = taskJson + "}";
//
//            int taskID = Integer.parseInt(extractValue(taskJson, "taskID"));
//            String desc = extractValue(taskJson, "taskDescription").replace("\"", "");
//            int status = Integer.parseInt(extractValue(taskJson, "taskStatus"));
//            String createdAt = extractValue(taskJson, "createdAt").replace("null", "null");
//            String updateAt = extractValue(taskJson, "updateAt").replace("null", "null");
//
//            tasks.add(new Task(taskID, desc, status, createdAt, updateAt));
//        }
//
//        // In kết quả
//        for (Task task : tasks) {
//            System.out.println(task);
//        }
    }
	    public static List<String> extractJsonBlocks(String input) {
	        List<String> result = new ArrayList<>();
	        StringBuilder currentBlock = new StringBuilder();
	
	        boolean inQuotes = false;
	        int braceCount = 0;
	
	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	
	            // Toggle inQuotes when encountering an unescaped "
	            if (c == '"' && (i == 0 || input.charAt(i - 1) != '\\')) {
	                inQuotes = !inQuotes;
	            }
	
	            if (c == '{' && !inQuotes) {
	                if (braceCount == 0) currentBlock = new StringBuilder(); // start new block
	                braceCount++;
	            }
	
	            if (braceCount > 0) {
	                currentBlock.append(c);
	            }
	
	            if (c == '}' && !inQuotes) {
	                braceCount--;
	                if (braceCount == 0) {
	                    result.add(currentBlock.toString());
	                }
	            }
	        }
	
	        return result;
	    }
//
//    private static String extractValue(String json, String key) {
//        String searchKey = "\"" + key + "\":";
//        int start = json.indexOf(searchKey);
//        if (start == -1) return null;
//
//        start += searchKey.length();
//
//        // Nếu là chuỗi
//        if (json.charAt(start) == '"') {
//            int end = json.indexOf('"', start + 1);
//            return json.substring(start + 1, end);
//        } else if (json.startsWith("null", start)) {
//            return "null";
//        } else {
//            // Nếu là số
//            int end = start;
//            while (end < json.length() && 
//                  (Character.isDigit(json.charAt(end)) || json.charAt(end) == '-')) {
//                end++;
//            }
//            return json.substring(start, end);
//        }
//    }
}
