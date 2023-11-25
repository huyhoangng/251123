package Day251123_demo1;

import java.util.Scanner;

public class News implements INews {
    private int id;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;

    public void setAuthor(String author) {
        Author = author;
    }

    public String getAuthor() {
        return Author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId(int i) {
        return id;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getContent() {
        return Content;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getTitle() {
        return Title;
    }

    @Override
    public void Display() {
        System.out.println("Title: " + Title);
        System.out.println("Publish Date: " + PublishDate);
        System.out.println("Author: " + Author);
        System.out.println("Content: " + Content);
        System.out.println("Average Rate: " + AverageRate);
    }
    private int[] rateList = new int[5];

    public void setRateList(int[] rateList) {
        this.rateList = rateList;
    }

    public int[] getRateList() {
        return rateList;
    }

    public void calculate() {
        int sum = 0;
        int count = 0;
        for (int rate : rateList) {
            if (rate >= 1 && rate <= 5) {
                sum += rate;
                count++;
            }
        }
        if (count > 0) {
            AverageRate = (float) sum / count;
        }
    }
    public void inputRate() {
        Scanner scanner = new Scanner(System.in);

        // Nhập giá trị đánh giá
        System.out.println("Enter ratings (1-5): ");
        for (int i = 0; i < rateList.length; i++) {
            System.out.print("Rating " + (i + 1) + ": ");
            int rating = scanner.nextInt();

            // Kiểm tra giá trị đánh giá và gán vào mảng
            if (rating >= 1 && rating <= 5) {
                rateList[i] = rating;
            } else {
                System.out.println("Invalid rating. Please enter a rating between 1 and 5.");
                i--; 
            }
        }
        calculate();
    }


}
