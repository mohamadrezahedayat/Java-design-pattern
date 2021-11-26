package com.Head8.mediator;

public class ArticlesDialogBox {
  private ListBox articlesListBox = new ListBox();
  private TextBox titleTextBox = new TextBox();
  private Button saveButton = new Button();

  public void simulateUserInteraction() {
    articlesListBox.setSelection("article 1");
    System.out.println("TextBox: " + titleTextBox.getContent());
    System.out.println("Button: " + saveButton.isEnable());
  }

  public ArticlesDialogBox() {
    /**
     * way 1 articlesListBox.attach(new Observer() {
     * 
     * @Override public void update() { } });
     * 
     *           way 2 articlesListBox.attach(() -> articleSelected());
     */
    // way 3
    articlesListBox.AddEventHandler(this::articleSelected);
    articlesListBox.AddEventHandler(this::titleChanged);
    articlesListBox.AddEventHandler(this::articleSelected);
  }

  private void titleChanged() {
    var content = titleTextBox.getContent();
    var isEmpty = (content == null || content.isEmpty());
    saveButton.setEnable(!isEmpty);
  }

  private void articleSelected() {
    titleTextBox.setContent(articlesListBox.getSelection());
    saveButton.setEnable(true);
  }
}
