package com.taehoon.project.C0327.Shelf;

public class BookShelfTest {
  public static void main(String[] args) {
    Queue shelfQueue = new BookShelf();
    shelfQueue.enQueue("태백산맥 1");
    shelfQueue.enQueue("태백산맥 2");
    shelfQueue.enQueue("태백산맥 3");

    System.out.printf("삭제 시작 전, 데이터 총 개수 : %d\n\n", shelfQueue.getSize());

    System.out.println("태백산맥 1 삭제");
    shelfQueue.deQueue();
    System.out.printf("현재 Queue 안의 데이터 개수 : %d\n\n", shelfQueue.getSize());

    System.out.println("태백산맥 2 삭제");
    shelfQueue.deQueue();
    System.out.printf("현재 Queue 안의 데이터 개수 : %d\n\n", shelfQueue.getSize());

    System.out.println("태백산맥 3 삭제");
    shelfQueue.deQueue();
    System.out.printf("현재 Queue 안의 데이터 개수 : %d\n\n", shelfQueue.getSize());

  }
}
