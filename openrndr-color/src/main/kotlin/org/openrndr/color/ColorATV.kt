package org.openrndr.color

data class Hue(val name: Int, val lambda: Double, val angle: Double, val xbl: Double, val ybl: Double, val zbl: Double, val xl: Double, val yl: Double, val sl: Double)

val hues = listOf(
        Hue(10, 570.83, 59.00, 0.7757450, 0.9465720, 0.0020320, 0.4498700, 0.5489500, 1.7243490),
        Hue(11, 572.64, 55.3, 0.8051300, 0.9338040, 0.0019100, 0.4624800, 0.5364100, 1.7408450),
        Hue(12, 574.38, 51.7, 0.8327820, 0.9203950, 0.0018080, 0.4745100, 0.5244400, 1.7549860),
        Hue(13, 576.06, 48.2, 0.8588410, 0.9064820, 0.0017640, 0.4860100, 0.5129800, 1.7670880),
        Hue(14, 577.5, 44.8, 0.8804880, 0.8937410, 0.0017240, 0.4957800, 0.5032500, 1.7759530),
        Hue(15, 579.31, 41.5, 0.9066520, 0.8767490, 0.0016720, 0.5079000, 0.4905200, 1.7850740),
        Hue(16, 580.95, 38.2, 0.9291240, 0.8603680, 0.0016120, 0.5187400, 0.4803500, 1.7911040),
        Hue(20, 582.65, 34.9, 0.9509090, 0.8423910, 0.0015310, 0.5298000, 0.4693400, 1.7948310),
        Hue(21, 584.46, 31.5, 0.9724540, 0.8247790, 0.0014310, 0.5413700, 0.4578300, 1.7986650),
        Hue(22, 586.43, 28.00, 0.9937530, 0.7997580, 0.0013080, 0.5536700, 0.4455900, 1.7948220),
        Hue(23, 588.59, 24.4, 1.0143500, 0.7740900, 0.0011700, 0.5668000, 0.4325300, 1.7896100),
        Hue(24, 591.06, 20.6, 1.0344020, 0.7740140, 0.0010670, 0.5812800, 0.4181100,1.7794840),
        Hue(25, 594.00, 16.6, 1.0524660, 0.7074960, 0.0010210, 0.5976600, 0.4017600, 1.7609840),
        Hue(26, 597.74, 12.3, 1.0625440, 0.6600010, 0.0008980, 0.6165300, 0.3830000, 1.7234440),
        Hue(30, 602.72, 7.7, 1.0561250, 0.5960700, 0.0006960, 0.6389600, 0.3606100, 1.6528920),
        Hue(31, 610.14, 2.8, 1.0010270, 0.5012450, 0.0003350, 0.6661900, 0.3335800, 1.5026080),
        Hue(32, 625.00, -2.5, 0.7514000, 0.3210000, 0.0001000, 0.7006100, 0.2993000, 1.0725000),
        Hue(33, -492.79, -8.4, 0.7266030, 0.3040930, 0.1059410, 0.6392500, 0.2675300, 1.1366380),
        Hue(34, -495.28, -19.8, 0.6896200, 0.2788860, 0.2637800, 0.5396200, 0.2263100, 1.2322860),
        Hue(35, -498.45, -31.6, 0.6595230, 0.2583730, 0.3922240, 0.5034000, 0.1972100, 1.3101220),
        Hue(40, -502.69, 43.2, 0.6338150, 0.2408510, 0.5019440, 0.4604100, 0.1749500, 1.3766100),
        Hue(41, -509.12, 54.6, 0.6098100, 0.2244900, 0.6043920, 0.4238600, 0.1560300, 1.4386920),
        Hue(42, -520.4, 65.8, 0.5854920, 0.2079150, 0.7081750, 0.3899100, 0.1384600, 1.5015830),
        Hue(43, -536.31, 76.8, 0.5588650, 0.1897670, 0.8218150, 0.3558600, 0.1208300, 1.5704470),
        Hue(44, -548.11, 86.8, 0.5298110, 0.1699650, 0.9458070, 0.3219500, 0.1032800, 1.6455840),
        Hue(45, -555.96, 95.8, 0.4963640, 0.1471680, 1.0885510, 0.2865700, 0.0849600, 1.7320850),
        Hue(46, -564.18, -108.4, 0.4253460, 0.0987640, 1.3916430, 0.2220200, 0.0515500, 1.9157540),
        Hue(50, 450.00, -117.2, 0.3362000, 0.0380000, 1.7721100, 0.1566400, 0.0177100, 2.1463100),
        Hue(51, 468.71, -124.7, 0.2101740, 0.0861980, 1.3535670, 0.1273600, 0.0522700, 1.6499400),
        Hue(52, 475.44, -131.8, 0.1377340, 0.1147700, 1.0209110, 0.1081300, 0.0902000, 1.2734150),
        Hue(53, 479.00, -138.5, 0.1017870, 0.1350670, 0.8439550, 0.0941400, 0.1250600, 1.0808090),
        Hue(54, 482.04, -145.1, 0.0790040, 0.1507090, 0.7278630, 0.0824900, 0.1574100, 0.9575770),
        Hue(55, 484.29, -152.00, 0.0626580, 0.1646260, 0.6416920, 0.0720600, 0.1895800, 0.8689770),
        Hue(56, 487.31, -163.4, 0.0446910, 0.1859490, 0.5410910, 0.0578700, 0.2410900, 0.7717320),
        Hue(60, 490.4, -177.2, 0.0303720, 0.2116590, 0.4550770, 0.0435300, 0.3037800, 0.6971100),
        Hue(61, 492.72, 171.6, 0.0216550, 0.2340220, 0.4001260, 0.0329100, 0.3569600, 0.6558040),
        Hue(62, 495.28, 125.4, 0.0139890, 0.2618430, 0.3481360, 0.0224000, 0.4197100, 0.6239690),
        Hue(63, 498.45, 148.4, 0.0072150, 0.3011370, 0.2876850, 0.0119600, 0.4995400, 0.5960370),
        Hue(64, 502.69, 136.8, 0.0025860, 0.3664250, 0.2384020, 0.0042500, 0.6032100, 0.6074140),
        Hue(65, 509.12, 125.4, 0.0072600, 0.4853460, 0.1673170, 0.0109900, 0.7354200, 0.6599240),
        Hue(66, 520.4, 114.2, 0.0660100, 0.7172740, 0.0762330, 0.0805000, 0.8339100, 0.8595230),
        Hue(70, 536.31, 103.2, 0.2422720, 0.9263250, 0.0270860, 0.2025900, 0.7747400, 1.1956840),
        Hue(71, 548.11, 93.2, 0.4066630, 0.9905870, 0.0102840, 0.2880700, 0.7046000, 1.4100970),
        Hue(72, 555.96, 84.2, 0.5276460, 0.9998620, 0.0053210, 0.3442200, 0.6523000, 1.5328300),
        Hue(73, 560.74, 77.3, 0.6068730, 0.9932240, 0.0036950, 0.3783800, 0.6193000, 1.6037930),
        Hue(74, 564.18, 71.6, 0.6645990, 0.9819810, 0.0028680, 0.4029000, 0.5953300, 1.6494490),
        Hue(75, 566.78, 66.9, 0.7083580, 0.9702520, 0.0024700, 0.4214100, 0.5771600, 1.6810810),
        Hue(76, 568.92, 62.8, 0.7441820, 0.9585920, 0.0022050, 0.4364700, 0.5622200, 1.7049810)
)
fun findHue(id: Int): Hue? = hues.find { it.name == id }

@Suppress("MemberVisibilityCanBePrivate", "unused")
data class ColorATVa(val id: Int, val t: Double, val v: Double, val alpha: Double = 1.0) {

    companion object {
        fun maxT(id:Int, v:Double):Double {
            var left = 0.0
            var right = 200.0
            var bestGuess = left
            while (true) {

                if (right-left < 0.0001) {
                    return bestGuess
                }

                val leftTry = ColorATVa(id, left, v, 1.0)
                val rightTry = ColorATVa(id, right, v, 1.0)
                val middle = (left + right) / 2
                val middleTry = ColorATVa(id, middle, v, 1.0)

                val leftValid = leftTry.toRGBa().let { it.minValue >= 0 && it.maxValue <= 1.0 }
                val rightValid = rightTry.toRGBa().let { it.minValue >= 0 && it.maxValue <= 1.0 }
                val middleValid = middleTry.toRGBa().let { it.minValue >= 0 && it.maxValue <= 1.0 }


                if (leftValid && middleValid && !rightValid) {
                    val newLeft = middle
                    val newRight = right
                    bestGuess = middle
                    left = newLeft
                    right = newRight
                }

                if (leftValid && !middleValid && !rightValid) {
                    val newLeft = left
                    val newRight = middle
                    left = newLeft
                    right = newRight
                }

                if (!leftValid && middleValid && rightValid) {
                    val newLeft = left

                    left = newLeft
                    right = middle
                }

                if (leftValid == middleValid && middleValid == rightValid) {
                    return bestGuess
                }
            }
        }
    }

    fun toColorYxya(): ColorYxya {
        val hue = findHue(id)
        return hue?.let {
            val sigmaW = 3.162955
            val x0 = 0.312726
            val yy = Math.pow(v / 10.0, 2.0) / 100.0
            val ybl = hue.ybl * 100.0

            val x = (sigmaW * x0 * (v * v - t * ybl) + 100 * t * hue.sl * hue.xl) /
                    (sigmaW * (v * v - t * ybl) + 100 * t * hue.sl)

            val y = (v * v + 100 * t * hue.sl * hue.yl - t * ybl) /
                    (sigmaW * (v * v - t * ybl) + 100 * t * hue.sl)

            ColorYxya(yy, x, y)
        } ?: ColorYxya(0.0, 0.0, 0.0, 0.0)
    }
    fun toRGBa():ColorRGBa = toColorYxya().toXYZa().toRGBa()
}