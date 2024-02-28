import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKetQua;
	
	public ManHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Chương trình Tính toán đơn giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất (a)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(36, 70, 172, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai (b)");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(36, 124, 172, 24);
		contentPane.add(lblNhpSTh);
		
		txtA = new JTextField();
		txtA.setBounds(218, 70, 310, 24);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(218, 124, 310, 24);
		contentPane.add(txtB);
		
		JButton btnNewButton = new JButton("CỘNG");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý Cộng ở đây
				//Viết lệnh ở một thủ tục/hàm, rồi gọi ở đây
			HamXyLyCong();
			}
		});
		btnNewButton.setBounds(69, 271, 99, 34);
		contentPane.add(btnNewButton);
		
		JButton btnTr = new JButton("TRỪ");
		btnTr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý Trừ ở đây
				//Viết lệnh ở một thủ tục/hàm, rồi gọi ở đây
				HamXyLyTru();
			}
		});
		btnTr.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTr.setBounds(188, 271, 99, 34);
		contentPane.add(btnTr);
		
		JButton btnNhn = new JButton("NHÂN");
		btnNhn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXyLyNhan();
			}
		});
		btnNhn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhn.setBounds(307, 271, 99, 34);
		contentPane.add(btnNhn);
		
		JButton btnChia = new JButton("CHIA");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXyLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(429, 271, 99, 34);
		contentPane.add(btnChia);
		
		JLabel lblKtQuTnh = new JLabel("Kết quả tính toán:");
		lblKtQuTnh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQuTnh.setBounds(36, 343, 172, 24);
		contentPane.add(lblKtQuTnh);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(218, 346, 310, 24);
		contentPane.add(txtKetQua);
	}//hết hàm tạo
	void HamXyLyCong() {
		//Lấy dữ liệu từ điều khiển
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		Double soA = Double.parseDouble(str_soA);
		Double soB = Double.parseDouble(str_soB);
		//Tinh toán
		double tong = soA+soB;
		//Đưa ra hiển thị lên điều khiển
		txtKetQua.setText(String.valueOf(tong));
	}
	void HamXyLyTru() {
		//Lấy dữ liệu từ điều khiển
				String str_soA = txtA.getText();
				String str_soB = txtB.getText();
				Double soA = Double.parseDouble(str_soA);
				Double soB = Double.parseDouble(str_soB);
				//Tinh toán
				double hieu = soA-soB;
				//Đưa ra hiển thị lên điều khiển
				txtKetQua.setText(String.valueOf(hieu));
	}
	void HamXyLyNhan() {
		//Lấy dữ liệu từ điều khiển
				String str_soA = txtA.getText();
				String str_soB = txtB.getText();
				Double soA = Double.parseDouble(str_soA);
				Double soB = Double.parseDouble(str_soB);
				//Tinh toán
				double tich = soA*soB;
				//Đưa ra hiển thị lên điều khiển
				txtKetQua.setText(String.valueOf(tich));
	}
	void HamXyLyChia() {
		//Lấy dữ liệu từ điều khiển
				String str_soA = txtA.getText();
				String str_soB = txtB.getText();
				Double soA = Double.parseDouble(str_soA);
				Double soB = Double.parseDouble(str_soB);
				//Tinh toán
				double kq = soA/soB;
				//Đưa ra hiển thị lên điều khiển
				txtKetQua.setText(String.valueOf(kq));
	}
}
