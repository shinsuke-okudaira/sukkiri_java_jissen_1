package sukkiri_java_jissen_1;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {

	@Override
	public int compare(final Book x, final Book y) {

		return x.getTitle().compareTo(y.getTitle());
	}

}
