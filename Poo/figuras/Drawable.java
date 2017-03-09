package figuras;

import java.io.IOException;

public interface Drawable {
	void draw();
	default void applyTheme() throws IOException {
		throw new IOException("error");
	}
}
