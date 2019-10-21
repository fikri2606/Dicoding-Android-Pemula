package com.example.gunungdiindonesia;

import java.util.ArrayList;

public class DataGunung {
    private static String[] namaGunung = {
            "Gunung Simeru",
            "Gunung Krinci",
            "Gunung Bromo",
            "Gunung Rinjani",
            "Gunung Marapi",
            "Gunung Agung",
            "Gunung Ciremai",
            "Gunung Sindara",
            "Gunung Merbabu",
            "Gunung Dempo",
            "Gunung Raung"
    };

    private static String[] lokasiGunung = {
            "Jawa Timur",
            "Sumatera Barat",
            "jawa Timur",
            "Nusa Tenggara Barat",
            "Sumatera Barat",
            "Bali",
            "Jawa Barat",
            "Jawa Tengah",
            "Jawa Tengah",
            "Sumatera Selatan",
            "Jawa Timur"
    };

    private static String[] tinggiGunung = {
            "3.676 MDPL",
            "3.805 MDPL",
            "2.329 MDPL",
            "3.726 MDPL",
            "2.891 MDPL",
            "3.031 MDPL",
            "3.084 MDPL",
            "3.136 MDPL",
            "3.142 MDPL",
            "3.173 MDPL",
            "3.344 MDPL"
    };

    private static String[] detailGunung = {
            "Gunung Semeru atau Gunung Meru adalah sebuah gunung berapi kerucut di Jawa Timur, Indonesia. Gunung Semeru merupakan gunung tertinggi di Pulau Jawa, dengan puncaknya Mahameru, 3.676 meter dari permukaan laut (mdpl). Gunung Semeru juga merupakan gunung berapi tertinggi ketiga di Indonesia setelah Gunung Kerinci di Sumatera dan Gunung Rinjani di Nusa Tenggara Barat. Kawah di puncak Gunung Semeru dikenal dengan nama Jonggring Saloko. Gunung Semeru secara administratif termasuk dalam wilayah dua kabupaten, yakni Kabupaten Malang dan Kabupaten Lumajang, Provinsi Jawa Timur. Gunung ini termasuk dalam kawasan Taman Nasional Bromo Tengger Semeru.\n" +
                    "\n" +
                    "Semeru mempunyai kawasan hutan Dipterokarp Bukit, hutan Dipterokarp Atas, hutan Montane, dan Hutan Ericaceous atau hutan gunung.\n" +
                    "\n" +
                    "Posisi geografis Semeru terletak antara 8°06' LS dan 112°55' BT",
            "Gunung Kerinci (juga dieja \"Kerintji\", dan dikenal sebagai Gunung Gedang, Berapi Kurinci, Kerinchi, Korinci, atau Puncak Indrapura) adalah gunung tertinggi di Sumatra, gunung berapi tertinggi di Indonesia, dan puncak tertinggi di Indonesia di luar Papua. Gunung Kerinci terletak di Provinsi Jambi, di Pegunungan Bukit Barisan, dekat pantai barat, dan terletak sekitar 130 km sebelah selatan Padang Provinsi Sumatra Barat. Gunung ini dikelilingi hutan lebat Taman Nasional Kerinci Seblat dan merupakan habitat harimau sumatra dan badak sumatra.\n" +
                    "\n" +
                    "Puncak Gunung Kerinci berada pada ketinggian 3.805 mdpl, di Kabupaten Kerinci, Provinsi Jambi, di sini pengunjung dapat melihat di kejauhan membentang pemandangan indah Kota Jambi, Padang, dan Bengkulu. Bahkan Samudera Hindia yang luas dapat terlihat dengan jelas. Gunung Kerinci memiliki kawah seluas 400 x 120 meter dan berisi air yang berwarna hijau. Di sebelah timur terdapat danau Bento, rawa berair jernih tertinggi di Sumatra. Di belakangnya terdapat gunung tujuh dengan kawah yang sangat indah yang hampir tak tersentuh.\n" +
                    "\n" +
                    "Gunung Kerinci merupakan gunung berapi bertipe stratovulcano yang masih aktif dan terakhir kali meletus pada tahun 2009.",
            "Gunung Bromo (dari bahasa Sanskerta: Brahma, salah seorang Dewa Utama dalam agama Hindu) atau dalam bahasa Tengger dieja \"Brama\", adalah sebuah gunung berapi aktif di Jawa Timur, Indonesia. Gunung ini memiliki ketinggian 2.329 meter di atas permukaan laut dan berada dalam empat wilayah kabupaten, yakni Kabupaten Probolinggo, Kabupaten Pasuruan, Kabupaten Lumajang, dan Kabupaten Malang. Gunung Bromo terkenal sebagai objek wisata utama di Jawa Timur. Sebagai sebuah objek wisata, Bromo menjadi menarik karena statusnya sebagai gunung berapi yang masih aktif. Gunung Bromo termasuk dalam kawasan Taman Nasional Bromo Tengger Semeru.\n" +
                    "\n" +
                    "Bentuk tubuh Gunung Bromo bertautan antara lembah dan ngarai dengan kaldera atau lautan pasir seluas sekitar 10 kilometer persegi. Ia mempunyai sebuah kawah dengan garis tengah ± 800 meter (utara-selatan) dan ± 600 meter (timur-barat). Sedangkan daerah bahayanya berupa lingkaran dengan jari-jari 4 km dari pusat kawah Bromo.",
            "Gunung Rinjani adalah gunung yang berlokasi di Pulau Lombok, Nusa Tenggara Barat. Gunung yang merupakan gunung berapi kedua tertinggi di Indonesia dengan ketinggian 3.726 m dpl serta terletak pada lintang 8º25' LS dan 116º28' BT ini merupakan gunung favorit bagi pendaki Indonesia karena keindahan pemandangannya. Gunung ini merupakan bagian dari Taman Nasional Gunung Rinjani yang memiliki luas sekitar 41.330 ha dan ini akan diusulkan penambahannya sehingga menjadi 76.000 ha ke arah barat dan timur.\n" +
                    "\n" +
                    "Secara administratif gunung ini berada dalam wilayah tiga kabupaten: Lombok Timur, Lombok Tengah dan Lombok Barat.\n"+
                    "\n"+
                    "Gunung Rinjani dengan titik tertinggi 3.726 m dpl, mendominasi sebagian besar pemandangan Pulau Lombok bagian utara.\n" +
                    "\n" +
                    "Di sebelah barat kerucut Rinjani terdapat kaldera dengan luas sekitar 3.500 m × 4.800 m, memanjang kearah timur dan barat. Di kaldera ini terdapat Segara Anak (segara= laut, danau) seluas 11.000.000 m persegi dengan kedalaman 230 m. Air yang mengalir dari danau ini membentuk air terjun yang sangat indah, mengalir melewati jurang yang curam. Di Segara Anak banyak terdapat ikan mas dan mujair sehingga sering digunakan untuk memancing. Bagian selatan danau ini disebut dengan Segara Endut.\n" +
                    "\n" +
                    "Di sisi timur kaldera terdapat Gunung Baru (atau Gunung Barujari) yang memiliki kawah berukuran 170m×200 m dengan ketinggian 2.296 - 2376 m dpl. Gunung kecil ini terakhir meletus pada tanggal 25 Oktober 2015 dan 3 November 2015, setelah sebelumnya tercatat meletus Mei 2009 dan pada tahun 2004. Jika letusan tahun 2004 tidak memakan korban jiwa, letusan tahun 2009 ini telah memakan korban jiwa tidak langsung 31 orang, karena banjir bandang pada Kokok (Sungai) Tanggek akibat desakan lava ke Segara Anak.[5] Sebelumnya, Gunung Barujari pernah tercatat meletus pada tahun 1944 (sekaligus pembentukannya), 1966, dan 1994.\n" +
                    "\n" +
                    "Selain Gunung Barujari terdapat pula kawah lain yang pernah meletus,disebut Gunung Rombongan.",
            "Gunung Marapi (juga dikenal sebagai Merapi atau Berapi) adalah gunung berapi yang terletak di Sumatra Barat, Indonesia. Gunung ini tergolong gunung yang paling aktif di Sumatra. Terletak dalam kawasan administrasi Kabupaten Agam. Gunung ini dapat juga dilihat dari kota Bukittinggi, kota Padangpanjang dan kabupaten Tanah Datar dan memiliki ketinggian 2.891 m. Gunung Marapi sudah meletus lebih dari 50 kali sejak akhir abad 18.\n"+
                    "\n"+"Pada tanggal 8 September 1830 dilaporkan Gunung Marapi mengeluarkan awan yang berbentuk kembang kol abu-abu kehitaman dengan ketebalan 1.500 m di atas kawahnya, disertai dengan suara gemuruh.\n" +
                    "Pada tanggal 30 April 1979, menurut laporan pers disebutkan 60 orang tewas akibat letusan Gunung Marapi dan disebutkan juga 19 orang pekerja penyelamat terperangkap oleh tanah longsor. Letusan tersebut dikatakan juga mengeluarkan batu dan lumpur yang menyebabkan kerusakan sedikitnya pada lima daerah kawasan pemukiman penduduk setempat.\n" +
                    "Memasuki akhir tahun 2011 hingga awal tahun 2014, Gunung Marapi menampakkan peningkatan aktivitasnya melalui letusan yang menyemburkan abu dan awan hitam. Pernah diakhir tahun 2011 semburan abu terbawa angin berkilo-kilo jaraknya hingga mencapai Kabupaten Padang Pariaman.\n" +
                    "Tanggal 26 Februari 2014, Gunung Marapi meletus pada pukul 16.15 WIB, melepaskan material pasir, tefra, dan abu vulkanik ke wilayah Kabupaten Tanah Datar dan Agam. Status gunung ditetapkan Siaga (level 2) dan radius 3 km dari pusat kawah harus dikosongkan. Tidak ada evakuasi pada letusan ini.",
            "Gunung Agung adalah gunung tertinggi di pulau Bali dengan ketinggian 3.031 mdpl. Gunung ini terletak di kecamatan Rendang, Kabupaten Karangasem, Bali, Indonesia. Pura Besakih, yang merupakan salah satu Pura terpenting di Bali, terletak di lereng gunung ini.\n" +
                    "\n" +
                    "Gunung Agung adalah gunung berapi tipe stratovolcano, gunung ini memiliki kawah yang sangat besar dan sangat dalam yang kadang-kadang mengeluarkan asap dan uap air. Dari Pura Besakih gunung ini tampak dengan kerucut runcing sempurna, tetapi sebenarnya puncak gunung ini memanjang dan berakhir pada kawah yang melingkar dan lebar.\n" +
                    "\n" +
                    "Dari puncak gunung Agung kita dapat melihat puncak Gunung Rinjani yang berada di pulau Lombok di sebelah timur, meskipun kedua gunung tertutup awan karena kedua puncak gunung tersebut berada di atas awan, kepulauan Nusa Penida di sebelah selatan beserta pantai-pantainya, termasuk pantai Sanur serta gunung dan danau Batur di sebelah barat laut.",
            "Gunung Ceremai (seringkali secara salah kaprah dinamakan \"Ciremai\") (Aksara Sunda Baku: ᮌᮥᮔᮥᮀ ᮎᮨᮛᮨᮙᮦ, Latin: Gunung Ceremé) adalah gunung berapi kerucut yang secara administratif termasuk dalam wilayah dua kabupaten, yakni Kabupaten Kuningan dan Kabupaten Majalengka, Provinsi Jawa Barat. Posisi geografis puncaknya terletak pada 6° 53' 30\" LS dan 108° 24' 00\" BT, dengan ketinggian 3.078 m di atas permukaan laut. Gunung ini merupakan gunung tertinggi di Jawa Barat.\n" +
                    "\n" +
                    "Gunung ini memiliki kawah ganda. Kawah barat yang beradius 400 m terpotong oleh kawah timur yang beradius 600 m. Pada ketinggian sekitar 2.900 m dpl di lereng selatan terdapat bekas titik letusan yang dinamakan Gowa Walet.\n" +
                    "\n" +
                    "Kini G. Ceremai termasuk ke dalam kawasan Taman Nasional Gunung Ciremai (TNGC), yang memiliki luas total sekitar 15.000 hektare.\n" +
                    "\n" +
                    "Nama gunung ini berasal dari kata cereme (Phyllanthus acidus, sejenis tumbuhan perdu berbuah kecil dengan rasa masam), namun seringkali disebut Ciremai, suatu gejala hiperkorek akibat banyaknya nama tempat di wilayah Pasundan yang menggunakan awalan 'ci-' untuk penamaan tempat.",
            "Gunung Sindoro, biasa disebut Sindara, atau juga Sundoro (Ketinggian puncak 3.150 mdpl) merupakan sebuah gunung volkano aktif yang terletak di Jawa Tengah, Indonesia, dengan Temanggung sebagai kota terdekat. Gunung Sindoro terletak berdampingan dengan Gunung Sumbing.Gunung sindara dapat terlihat jelas dari puncak sikunir dieng\n" +
                    "\n" +
                    "Kawah yang disertai jurang dapat ditemukan di sisi barat laut ke selatan gunung, dan yang terbesar disebut Kembang. Sebuah kubah lava kecil menempati puncak gunung berapi. Sejarah letusan Gunung Sindara yang telah terjadi sebagian besar berjenis ringan sampai sedang (letusan freatik).\n" +
                    "\n" +
                    "Hutan di kawasan Gunung Sundoro mempunyai bertipe hutan Dipterokarp Bukit, hutan Dipterokarp Atas, hutan Montane, dan Hutan Ericaceous atau hutan gunung.",
            "Gunung Merbabu adalah gunung api yang bertipe Strato (lihat Gunung Berapi) yang terletak secara geografis pada 7,5° LS dan 110,4° BT. Secara administratif gunung ini berada di wilayah Kabupaten Magelang di lereng sebelah barat dan Kabupaten Boyolali di lereng sebelah timur dan selatan, Kabupaten Semarang di lereng sebelah utara, Provinsi Jawa Tengah.\n" +
                    "\n" +
                    "Gunung Merbabu dikenal melalui naskah-naskah masa pra-Islam sebagai Gunung Damalung atau Gunung Pam(a)rihan. Di lerengnya pernah terdapat pertapaan terkenal dan pernah disinggahi oleh Bujangga Manik pada abad ke-15. Menurut etimologi, \"merbabu\" berasal dari gabungan kata \"meru\" (gunung) dan \"abu\" (abu). Nama ini baru muncul pada catatan-catatan Belanda.\n" +
                    "\n" +
                    "Gunung ini pernah meletus pada tahun 1560 dan 1797. Dilaporkan juga pada tahun 1570 pernah meletus, akan tetapi belum dilakukan konfirmasi dan penelitian lebih lanjut. Puncak gunung Merbabu berada pada ketinggian 3.145 meter di atas permukaan air laut.\n" +
                    "\n" +
                    "Gunung Merbabu mempunyai kawasan Hutan Dipterokarp Bukit, Hutan Dipterokarp Atas, Hutan Montane, dan hutan Ericaceous atau hutan gunung.",
            "Gunung Dempo (3'173 mdpl) terletak di perbatasan provinsi Sumatra Selatan dan provinsi Bengkulu tepatnya di kota dingin penghasil kopi robusta yaitu Kota Pagaralam. Gunung Dempo terletak di kota Pagaralam, dengan jarak tempuh darat sekitar 7 jam dari Palembang, ibu kota provinsi Sumatra Selatan.\n" +
                    "\n" +
                    "Sesuai dengan namanya, Kota Pagaralam dikelilingi oleh pegunungan Bukit Barisan dan yang tertinggi adalah Gunung Dempo.",
            "Gunung Raung (puncak tertinggi: 3.260 m dpl)[butuh rujukan] adalah gunung berapi kerucut yang terletak di ujung timur Pulau Jawa, Indonesia. Secara administratif, kawasan gunung ini termasuk dalam wilayah tiga kabupaten di wilayah Besuki, Jawa Timur, yaitu Banyuwangi, Bondowoso, dan Jember.\n" +
                    "\n" +
                    "Secara geografis, lokasi gunung ini berada dalam kawasan kompleks Pegunungan Ijen dan menjadi puncak tertinggi dari gugusan pegunungan tersebut. Dihitung dari titik tertinggi, Gunung Raung merupakan gunung tertinggi ketiga di Jawa Timur setelah Gunung Semeru dan Gunung Arjuno, serta menjadi yang tertinggi keempat di Pulau Jawa. Kaldera Gunung Raung juga merupakan kaldera kering yang terbesar di Pulau Jawa dan terbesar kedua di Indonesia setelah Gunung Tambora di Nusa Tenggara Barat[2]. Terdapat empat titik puncak, yaitu Puncak Bendera, Puncak 17, Puncak Tusuk Gigi, dan, yang tertinggi, Puncak Sejati (3.344 m).[butuh rujukan]\n" +
                    "\n" +
                    "Dilihat dari vegetasinya, Gunung Raung memunyai kawasan hutan Dipterokarp Bukit, hutan Dipterokarp Atas, hutan Montane, dan hutan Ericaceous atau hutan gunung."
    };

    private static int[] gambarGunung = {
            R.drawable.simeru,
            R.drawable.kerinci,
            R.drawable.bromo,
            R.drawable.rinjani,
            R.drawable.marapi,
            R.drawable.agung,
            R.drawable.ciremai,
            R.drawable.sindara,
            R.drawable.merbabu,
            R.drawable.dempo,
            R.drawable.raung
    };

    static ArrayList<Gunung> getListData() {
        ArrayList<Gunung> list = new ArrayList<>();
        for (int position = 0; position < namaGunung.length; position++) {
            Gunung gunung = new Gunung();
            gunung.setGambar(gambarGunung[position]);
            gunung.setNama(namaGunung[position]);
            gunung.setDetail(detailGunung[position]);
            gunung.setLokasi(lokasiGunung[position]);
            gunung.setTinggi(tinggiGunung[position]);
            list.add(gunung);
        }
        return list;
    }
}
