package sukkiri_java_jissen_1;

import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {
	private String title;
	private Date publishDate;
	private String comment;

	@Override
	public int hashCode() {
		return Objects.hash(title, publishDate, comment);
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (!(o instanceof final Book r)) {
			return false;
		}
		final Book b = (Book) o;
		if (!title.equals(b.title)) {
			return false;
		}
		if (!publishDate.equals(b.publishDate)) {
			return false;
		}
		return true;
	}

	@Override
	public final int compareTo(final Book o) {
		return publishDate.compareTo(o.publishDate);
	}

	@Override
	public Book clone() {
		final Book b = new Book();
		b.title = title;
		b.publishDate = publishDate;
		b.comment = comment;
		b.publishDate = (Date) publishDate.clone();
		return b;

	}

	public String getTitle() {
		return title;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public String getComment() {
		return comment;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public void setPublishDate(final Date publishDate) {
		this.publishDate = publishDate;
	}

	public void setComment(final String comment) {
		this.comment = comment;
	}
}
