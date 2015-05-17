package co.com.udem.rumboteca.persistence.entity;

/**
 * This class manage comment persistence
 * @author Milton
 */
public class Comment {
  
  /** Comment */
  private String comment;
  
  /** Identifier */
  private int id;

  /** Review identifier */
  private int reviewId;

  /**
   * @return the comment
   */
  public String getComment() {
    return comment;
  }

  /**
   * @param comment the comment to set
   */
  public void setComment(String comment) {
    this.comment = comment;
  }

  /**
   * @return the id
   */
  public int getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * @return the reviewId
   */
  public int getReviewId() {
    return reviewId;
  }

  /**
   * @param reviewId the reviewId to set
   */
  public void setReviewId(int reviewId) {
    this.reviewId = reviewId;
  }
}
