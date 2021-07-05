package models

data class Magazine (
    public override val id: Int,
    public override var title: String,
    public override var author: String,
    public override var genre: String,
    public override var price: Double,
    public override var stock: Int,
    public override var favorite: Boolean=false,
    public override var discount: Int=0,
    private var Month:String,
    private var Year:Int
):Product(){
    init {
        countMagazine++
    }
}