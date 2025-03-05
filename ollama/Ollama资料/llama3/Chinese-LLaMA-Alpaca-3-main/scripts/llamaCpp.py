

model_name = "Qwen/Qwen1.5-1.8B"
methods = ['q4_k_m']
base_model = "./original_model2/"
quantized_path = "./quantized_model/"

snapshot_download(repo_id=model_name, local_dir=base_model , local_dir_use_symlinks=False)
original_model = quantized_path+'/FP16.gguf'

