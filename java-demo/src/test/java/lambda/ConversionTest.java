package lambda;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

class ConversionTest {

	@Test
	void shouldConvertIntArrayToIntegerList() {
		int[] arr = {1,2,2,6,8,3,8,9};
		
		List<Integer> list = IntStream.of(arr).boxed().toList();
		
		assertEquals("[1, 2, 2, 6, 8, 3, 8, 9]", list.toString());
	}

	@Test
	void shouldConvertIntegerListToIntArry() {
		List<Integer> list = Arrays.asList(1,2,2,6,8,3,8,9);
		
		assertArrayEquals(new int[]{1,2,2,6,8,3,8,9}, list.stream().mapToInt(i->i).toArray());
	}
}
