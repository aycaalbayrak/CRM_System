# CRM Sistemi - Temsilci Yönlendirme ve Kampanya Seçimi

Bu proje, müşteri destek temsilcilerinin doğru bir şekilde yönlendirilmesi ve bütçeye göre en uygun kampanyaların seçilmesi amacıyla dinamik programlama kullanarak geliştirilmiştir. Proje, temsilci ve müşteri atamaları ile kampanya seçimini optimizasyon yoluyla çözmeyi hedeflemektedir.

## İçindekiler
- [Proje Açıklaması](#proje-açıklaması)
- [Kurulum Talimatları](#kurulum-talimatları)
- [Kullanım](#kullanım)
- [Kod Yapısı](#kod-yapısı)


## Proje Açıklaması

Bu sistem, **temsilci yönlendirme** ve **kampanya seçimi** algoritmalarını içerir:

1. **Temsilci Yönlendirme:** Müşteriler, temsilcilerin kapasitelerine ve şehirlerine göre en uygun şekilde atanır.
2. **Kampanya Seçimi:** Her temsilci, bütçesine göre en uygun kampanyaları seçer. Kampanyaların maliyetleri ve getiri oranları göz önünde bulundurularak, dinamik programlama ile en verimli kampanya seti belirlenir.

### Kullanılan Teknolojiler:
- Java
- Dinamik Programlama (DP) Yöntemleri

## Kurulum Talimatları

### Gereksinimler:
- **Java 8 veya üzeri** yüklü olmalıdır.
- Maven (proje bağımlılıklarını yönetmek için).

### Adım Adım Kurulum:

1. Bu projeyi bilgisayarınıza klonlayın:
    ```bash
    git clone https://github.com/username/crm-sistemi.git
    ```

2. Proje dizinine gidin:
    ```bash
    cd crm-sistemi
    ```

3. Bağımlılıkları yüklemek için Maven'i kullanın:
    ```bash
    mvn install
    ```

4. Uygulamayı başlatın:
    ```bash
    mvn spring-boot:run
    ```

Uygulama, varsayılan olarak `http://localhost:8080` adresinde çalışacaktır.

## Kullanım

Proje, **temsilci yönlendirme** ve **kampanya seçimi** işlevselliklerini sağlar.

### Temsilci Yönlendirme:
- `musteriAtamaDP()` fonksiyonu, her müşteri için en uygun temsilciyi atamak amacıyla dinamik programlama kullanır.

### Kampanya Seçimi:
- `enIyiKampanyalariBul()` fonksiyonu, her temsilci için bütçelerine uygun kampanyaları seçer.

### Uygulama Çıktısı:
- Uygulama, temsilcilerin atanan müşterilerini ve seçilen kampanyaları konsola yazdırır.

Örnek çıktı:

![image](https://github.com/user-attachments/assets/f3439fa6-eaf8-4f37-bbf9-8fdf8b797faf)



## Kod Yapısı

Proje, aşağıdaki ana sınıflardan oluşmaktadır:

### 1. **Musteri**
Bu sınıf, her bir müşteriyi temsil eder. Müşterinin adı, yaşadığı şehir ve yaptığı talep gibi bilgileri içerir. Temsilcilere atanacak müşterilerin temel verilerini tutar. Temsilciler, bu sınıf üzerinden ilgili müşteri bilgilerine ulaşır ve müşteri taleplerini işler.

### 2. **Temsilci**
Temsilci sınıfı, her bir müşteri temsilcisinin bilgilerini içerir. Temsilcilerin adı, çalıştığı şehir, kapasitesi ve bütçesi gibi bilgileri barındırır. Ayrıca, temsilciye atanmış olan müşteriler ve seçilen kampanyalar bu sınıf içinde tutulur. Temsilciler, şehir bazlı müşteri atamaları ve kampanya seçimlerinde kullanılır.

### 3. **Kampanya**
Kampanya sınıfı, sistemde sunulan kampanyaları temsil eder. Kampanyaların adı, maliyeti, getirisi ve kategorisi gibi bilgileri içerir. Temsilciler, bu kampanyaları seçerek bütçelerine uygun şekilde kampanya yönetimini yapar. Kampanyalar, temsilcilerin bütçelerine göre dinamik olarak seçilir.

### 4. **TemsilciYonlendirme**
Bu sınıf, müşteri-temsilci atama işlemlerini optimize etmek için kullanılır. Dinamik programlama teknikleriyle temsilcilere müşteri atamaları yapılır. Her temsilcinin kapasitesine ve şehir uyumuna göre müşteriler atanır. Bu sınıf, temsilcilerin en verimli şekilde çalışabilmesi için gerekli müşteri atama mantığını içerir.

### 5. **KampanyaSecim**
KampanyaSecim sınıfı, temsilcilerin bütçeleri doğrultusunda en uygun kampanyaların seçilmesini sağlar. Yine dinamik programlama tekniği kullanılarak, her temsilcinin bütçesi en verimli şekilde kampanyalara dağıtılır. Bu sınıf, kampanyaların maliyetleri ve getirileri doğrultusunda seçim yaparak bütçenin en iyi şekilde kullanılmasını hedefler.

### 6. **CRMSistemi**
Bu sınıf, sistemin ana sınıfıdır ve tüm işlemleri koordine eder. Temsilci atamaları ve kampanya seçim işlemleri burada başlatılır. Temsilci ve müşteri ilişkisi kurulup, kampanyalar seçildikten sonra sonuçlar burada yazdırılır. Ana giriş noktası olan bu sınıf, diğer sınıfların işlevlerini birleştirir ve sistemi çalıştırır.


## Teşekkürler

Bu projeyi geliştirmeme yardımcı olan tüm kaynaklar ve yazılım topluluklarına teşekkür ederim.❤️

---

## Yazar
 
**[AYÇA ALBAYRAK](https://github.com/aycaalbayrak)**



