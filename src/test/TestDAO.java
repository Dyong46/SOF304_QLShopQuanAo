package test;

import org.junit.Test;

import com.raven.DAO.NhaCungCapDAO;
import com.raven.model.NhaCungCap;

public class TestDAO {
	@Test(expected = Exception.class)
	public static void testInsertWithNullModel() {
		NhaCungCap model = null;
		NhaCungCapDAO dao =new NhaCungCapDAO();
		dao.insert(model);
	}
}
