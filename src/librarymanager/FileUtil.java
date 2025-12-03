package librarymanager;

import java.io.*;
import java.util.List;
import java.util.Map;

public class FileUtil {

    @SuppressWarnings("unchecked")
    public static Map<String, Book> loadBooks(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Map<String, Book>) ois.readObject();
        } catch (FileNotFoundException e) {
            return null; // first run, file not present
        } catch (Exception e) {
            System.out.println("Error loading books: " + e.getMessage());
            return null;
        }
    }

    public static void saveBooks(String fileName, Map<String, Book> books) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(books);
        } catch (Exception e) {
            System.out.println("Error saving books: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static Map<Integer, Member> loadMembers(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Map<Integer, Member>) ois.readObject();
        } catch (FileNotFoundException e) {
            return null;
        } catch (Exception e) {
            System.out.println("Error loading members: " + e.getMessage());
            return null;
        }
    }

    public static void saveMembers(String fileName, Map<Integer, Member> members) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(members);
        } catch (Exception e) {
            System.out.println("Error saving members: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static List<IssueRecord> loadIssues(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<IssueRecord>) ois.readObject();
        } catch (FileNotFoundException e) {
            return null;
        } catch (Exception e) {
            System.out.println("Error loading issues: " + e.getMessage());
            return null;
        }
    }

    public static void saveIssues(String fileName, List<IssueRecord> issues) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(issues);
        } catch (Exception e) {
            System.out.println("Error saving issues: " + e.getMessage());
        }
    }
}
