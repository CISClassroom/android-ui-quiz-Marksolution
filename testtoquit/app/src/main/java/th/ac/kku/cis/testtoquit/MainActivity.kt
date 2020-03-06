package th.ac.kku.cis.testtoquit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import th.ac.kku.cis.testtoquit.adapter.FlowerAdapter
import th.ac.kku.cis.testtoquit.model.Flower

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var students = mutableListOf<Flower>()

        students.add(Flower("นายกฤษฎา ท่าสะอาด ", "603410032-9", R.drawable.w))
        students.add(Flower("นายกัมพล โชติทอง", "603410034-5", R.drawable.w))
        students.add(Flower("นายณัฐนนท์ ทาไธสง", "603410041-8", R.drawable.w))
        students.add(Flower("นายนฤเบศร์ พระโรจน์", "603410047-6", R.drawable.w))
        students.add(Flower("นายพรหมพัฒน์ ชาญโชคประเสริฐ", "603410052-3", R.drawable.w))
        students.add(Flower("นายเมธาวี สารีผล", "603410057-3", R.drawable.w))
        students.add(Flower("นายรัฐเขต สีเหลือง", "603410059-9", R.drawable.w))
        students.add(Flower("นายรุ่งโรจน์ พลเยี่ยม", "603410060-4", R.drawable.w))
        students.add(Flower("นายวิธาน วงษาบุตร", "603410061-2", R.drawable.w))
        students.add(Flower("นางสาวศศิกร กอเสนาะรส", "603410063-8", R.drawable.w))
        students.add(Flower("นางสาวอนันตยา โคตรศรี", "603410070-1", R.drawable.w))
        students.add(Flower("นายอภิเดช นารอง", "603410071-9", R.drawable.w))
        students.add(Flower("นายอุทัยพันธ์ เที่ยงโคตร", "603410073-5", R.drawable.w))
        students.add(Flower("นางสาวพัชรี แอแป", "603410155-3", R.drawable.w))
        students.add(Flower("นางสาวศศิธร พิมมะทา", "603410156-1", R.drawable.w))
        students.add(Flower("นายสุรพร อินพิลึก", "603410157-9", R.drawable.w))
        students.add(Flower("นายกฤษดา อุ่นสำโรง", "603410194-3", R.drawable.w))
        students.add(Flower("นายณรงค์ศึก เตชะศรี", "603410200-4", R.drawable.w))
        students.add(Flower("นายติยพล ต่อติด", "603410200-4", R.drawable.w))
        students.add(Flower("นายทรัพย์ทวี เพ็ชรสาย", "603410200-4", R.drawable.w))
        students.add(Flower("นางสาวธิดารัตน์ ดานะพันธ์", "603410200-4", R.drawable.w))
        students.add(Flower("นายปิยทัศน์ นวกิจวัฒนา", "603410200-4", R.drawable.w))
        students.add(Flower("นายพรสิน มีสีบู", "603410200-4", R.drawable.w))
        students.add(Flower("นายพัชรพล ไทยมานี้", "603410200-4", R.drawable.w))
        students.add(Flower("นายวงษกร พันธ์พิบูลย์", "603410200-4", R.drawable.w))
        students.add(Flower("นายวรรณพงษ์ ภัททิยไพบูลย์", "603410200-4", R.drawable.w))
        students.add(Flower("นนายวิวัฒน์ วงษ์พิชัย", "603410200-4", R.drawable.w))
        students.add(Flower("นางสาวศุภรัตน์ นพวัติ", "603410200-4", R.drawable.w))
        students.add(Flower("นางสาวสิรินาถ จริยพันธ์", "603410200-4", R.drawable.w))
        students.add(Flower("นายเกียรติศักดิ์ วรภาพ", "603410200-4", R.drawable.w))
        students.add(Flower("นางสาวธัญสิริ ผลไสว", "603410200-4", R.drawable.w))
        students.add(Flower("นางสาวอาทิตยา ฉิมมาแก้ว", "603410200-4", R.drawable.w))





        var listview: ListView = findViewById(R.id.itemlist)

        listview.adapter = FlowerAdapter(
            this,
            R.layout.student, students
        )
        listview.setOnItemClickListener { parent, view, position, id ->
            //Toast.makeText(this,position.toString(),Toast.LENGTH_SHORT).show()
            if (position == 0) {
                var i = Intent(this, Kr_::class.java)
                startActivity(i)
            } else if (position == 1) {
                var i = Intent(this, Tan_::class.java)
                startActivity(i)

            }else if (position == 2) {
                var i = Intent(this, Natanon::class.java)
                startActivity(i)

            }else if (position == 3) {
                var i = Intent(this, Narubate::class.java)
                startActivity(i)

            }else if (position == 4) {
                var i = Intent(this, S6::class.java)
                startActivity(i)

            }else if (position == 5) {
                var i = Intent(this, S7::class.java)
                startActivity(i)

            }else if (position == 6) {
                var i = Intent(this, S8::class.java)
                startActivity(i)

            }else if (position == 7) {
                var i = Intent(this, S9::class.java)
                startActivity(i)

            }else if (position == 8) {
                var i = Intent(this, S10::class.java)
                startActivity(i)

            }else if (position == 9) {
                var i = Intent(this, s11::class.java)
                startActivity(i)

            }
            else if (position == 10) {
                var i = Intent(this, S12::class.java)
                startActivity(i)

            }
        }
    }
}
