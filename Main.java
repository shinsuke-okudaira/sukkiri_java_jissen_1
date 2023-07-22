package sukkiri_java_jissen_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(final String[] args) throws ParseException {
		final SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");

		final Book b1 = new Book();
		b1.setTitle("Java入門");
		b1.setPublishDate(f.parse("2011/09/07"));
		b1.setComment("スッキリわかる");

		final Book b2 = new Book();
		b2.setTitle("Python入門");
		b2.setPublishDate(f.parse("2019/05/11"));
		b2.setComment("カレーが食べたくなる");

		final Book b3 = new Book();
		b3.setTitle("C言語入門");
		b3.setPublishDate(f.parse("2018/05/21"));
		b3.setComment("ポインタも自由自在");

		final List<Book> books = new ArrayList<>();

		books.add(b1);
		books.add(b2);
		books.add(b3);

		Collections.sort(books, new TitleComparator());

		for (final Book b : books) {
			System.out
					.println("書名:" + b.getTitle() + " 発行日:" + f.format(b.getPublishDate()) + " コメント:" + b.getComment());

		}
	}
}
