package com.example.recycle_veiew

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycle_veiew.databinding.ItemViewBinding

typealias OnClickHero = (Hero) -> Unit

class HeroAdapter(
    private val listHero: List<Hero>,
    private val onClickHero: OnClickHero
): RecyclerView.Adapter<HeroAdapter.itemHeroViewHolder>() {
    inner class itemHeroViewHolder (private val binding: ItemViewBinding):RecyclerView.ViewHolder(binding.root){

        fun bind(data: Hero) {
            with(binding) {
                heroPotrait.setImageResource(data.imageResId)
                txtHeroName.text = data.HeroName
                nation.text = data.nation
                born.text = data.Born
                itemView.setOnClickListener {
                    onClickHero(data)
                }
            }
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HeroAdapter.itemHeroViewHolder {
        val binding = ItemViewBinding.inflate(
            LayoutInflater.from(
            parent.context), parent, false)
        return itemHeroViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HeroAdapter.itemHeroViewHolder, position: Int) {
        holder.bind(listHero[position])
    }

    override fun getItemCount(): Int = listHero.size
}